import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Twitter {

    Stack<Post> posts = new Stack<Post>();
    List<User> users = new ArrayList<User>();

    public Twitter() {
        
    }

    public void userExists(int idFinding){
        for (User user : this.users) {
            if(user.id == idFinding)
            return;  
        }
        createUser(idFinding);
        return;
        
    }

    public void createUser (int userId){
        this.users.add(new User(userId)); 
    }

    public User findUser (int findId) {
        userExists(findId);

        for (User user : this.users) {
            if(user.id == findId)
            return user;
        }
        return null;

        
    }
    
    public void postTweet(int userId, int tweetId) {
        this.posts.push(new Post(tweetId, userId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> output = new ArrayList<>();
       
        User user = findUser(userId);        
            for (int i = this.posts.size()-1; i>-1; i--) {
                Post post = this.posts.get(i);
            
                if(post.postUser == userId)
                    output.add(post.postId);

                if(output.size()==10)
                break;
                
                if(user.follow!=null){
                    if(user.follow.contains(post.postUser))
                        output.add(post.postId);  
                }

                if(output.size()==10)
                break;
            }
        return output;
    }
    
    public void follow(int followerId, int followeeId) {
        if(this.users == null){
            createUser(followerId);
            createUser(followeeId);
        }

        User follower = findUser(followerId);
        follower.Follow(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        User user = findUser(followerId);

        for (int i = 0; i < user.follow.size(); i++) {
            if(user.follow.get(i) == followeeId)
            user.follow.remove(i);

        }

    }
}

class Post {
    int postId;
    int postUser;

    public Post(int postId, int postUser) {
        this.postId = postId;
        this.postUser = postUser;
    }
}

class User{
    int id;
    List<Integer> follow;

    public User(int id) {
        this.id = id;   
        this.follow = new ArrayList<Integer>();
    }

    public void Follow (Integer userid){
        this.follow.add(userid);
        return;
    }
}




/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */