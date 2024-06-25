
package words;

public class ReverseCharSequence implements CharSequence {
    private final String original;

    public ReverseCharSequence(String original){
        this.original = original;
    }

    @Override 
    public int length(){
        return original.length();
    }

    @Override
    public char charAt(int index){
        if(index < 0 || index >= original.length()){
            throw new IndexOutOfBoundsException("Index out of bounds:" + index);
        }
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end){
        if (start < 0 || end > original.length() || start > end){
            throw new IndexOutOfBoundsException("Invalid start or end index:" + start + ", " + end);
        }
        StringBuilder subSeq = new StringBuilder(original.subSequence(original.length() - end, original.length() - start));
        return subSeq.reverse().toString();
    }

    @Override
    public String toString(){
        return new StringBuilder(original).reverse().toString();
    }

    
}