class ReverseString {

    String reverse(String inputString) {
        //first declare the length of the string
        int sizeOfString = inputString.length();
        //breaking the string into each character and assign that to the index value
        //reversing the order of the index
        StringBuilder sb = new StringBuilder();
        for (int i = sizeOfString - 1; i >= 0; i--) {

            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }
}
