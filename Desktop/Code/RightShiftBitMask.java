/*Find the Right Shift Bit mask */
public class RightShiftBitMask{
    public static void main(String args[]){
        getElement(72);

}
public static void getElement(int integer){

    int n = integer & -integer;
    System.out.println("Print the right shift Bit mask in Integer: "+n);
    System.out.println("Print the right shift Bit mask in Binary: "+Integer.toBinaryString(n));

}


}