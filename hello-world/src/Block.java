public class Block{
    int[] block = new int[3];
    int width = block[0];
    int length = block[1];
    int height = block[2];
    
    public Block(int[] block) {
        this.block = block;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getVolume(){
        return width*height*length;
    }

    public int getSurfaceArea (){
        return height*length*2+height*width*2+width*length*2;
    }


}