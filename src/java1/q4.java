//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
package java1;

public class q4 {
    public static void main(String[] args) {
        int uCount = 0;
        int lCount = 0;
        int digitCount = 0;
        int specialCount = 0;
        String st = "UUUU World ** 13";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if ((Character.isUpperCase(ch))) {
                uCount++;
            } else if ((Character.isLowerCase(ch))) {
                lCount++;

            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCount++;
            }

        }

        double length = st.length();
        double upperPercent = (uCount / length) * 100;
        double lowerPercent = (lCount / length) * 100;
        double digitPercent = (digitCount / length) * 100;
        double specialPercent = (specialCount/length)*100;
        System.out.println("Upper Percent:" + upperPercent + "\n" +"Lower Percent:" + lowerPercent
                + "\n" + "Digit Percent:" + digitPercent + "\n" + "Special Percent:" +specialCount );

    }


}