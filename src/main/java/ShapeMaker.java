
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        String result = "";
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j == size - 1) {
                    result += "*";
                }
                else{
                    result += "* ";
                }
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String result = "";
        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                if(j == length - 1) {
                    result += "*";
                }
                else{
                    result += "* ";
                }
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String result = "";
        for(int i = 0; i < height; i++){
            for(int j = 0; j < i+1; j++){
                if(j == i) {
                    result += "*";
                }
                else{
                    result += "* ";
                }
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String result = "";
        for(int i = 0; i < height; i++){
            for(int j = i; j < height; j++){
                if(j == height - 1){
                    result += "*";
                }
                else{
                    result += "* ";
                }
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        String result = "";
        int spaces = height + 1;
        for(int i = 0; i < height; i ++){
            int tempCount = spaces;
            while (tempCount > 0){
                tempCount--;
                result += " ";
            }
            for(int j = 0; j <= i; j++){
                if(j == i){
                    result += "*";
                }
                else{
                    result += "* ";
                }
            }
            spaces-=2;
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        String result = "";
        int spaces = height - 1;


        for(int i = 0; i < height; i++){
            int tempCount = spaces;
            while(tempCount > 0){
                result += " ";
                tempCount--;
            }
            for(int k = 0; k <= i; k++){
                if(k == i) {
                    result += "*";
                }
                else{
                    result += "* ";
                }
            }
            result += "\n";
            spaces -= 1;
        }
        return result;




    }
}
