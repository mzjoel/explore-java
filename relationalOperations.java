public class relationalOperations {
    public static void main(String[] args){
        int firstStatement = 5;
        int secondStatement = 10;
        boolean result;

        //>
        result = firstStatement > secondStatement;
        System.out.println("FirstStatement > SecondStatement = "+result);
        //<
        result = firstStatement < secondStatement;
        System.out.println("FirstStatement < SecondStatement = "+result);
        //>=
        result = firstStatement >= secondStatement;
        System.out.println("FirstStatement >= SecondStatement = "+result);
        //<=
        result = firstStatement <= secondStatement;
        System.out.println("FirstStatement <= SecondStatement = "+result);
        //==
        result = firstStatement == secondStatement;
        System.out.println("FirstStatement == SecondStatement = "+result);
        //!=
        result = firstStatement != secondStatement;
        System.out.println("FirstStatement != SecondStatement = "+result);

    }
}
