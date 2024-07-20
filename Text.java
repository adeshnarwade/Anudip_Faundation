public class Text {
    public static void main(String[] args){

        String sentence = "My Name Is Aadesh";

        //Replace multiple space with single #

        String replacedSpace = sentence.replaceAll("\\s+","#");

        //replace all space with #

        replacedSpace = replacedSpace.replaceAll("\\s","#");

        System.out.println("Before replace:");
        System.out.println(sentence);
        System.out.println("After Replacement:");
        System.out.println(replacedSpace);

    }
    

}
