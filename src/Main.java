import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1
        System.out.println("Task no 1:");
        Scanner ourArray = new Scanner(System.in);
        Scanner elementOfArray = new Scanner(System.in);
        System.out.println("Please enter how big you want your array to be: ");
        int arrayLength = ourArray.nextInt();
        int[] array = new int[arrayLength]; //pravimo novi array koji će storati intove koje unosimo

        //dakle sve dok ne dođemo do arrayLength (br elemenata), program će nam tražiti da unosimo naše intove
        for(int i=0; i<arrayLength; i++){
            System.out.println("Please enter your integer: ");
            int placeInArray = elementOfArray.nextInt();
            array[i] = placeInArray; //ovim smo storali naše intove u ovaj novi array
        }

        //loopa kroz ovaj novi array i traži parne vs neparne (logika kako se obrne objašnjena u zadatku 3)
        for(int i=arrayLength-1; i>=0; i--){
            if (array[i]%2==0){
                System.out.println(array[i] + " even");
            }
            else{
                System.out.println(array[i] + " odd");
            }
        }


        //Zadatak 2
        System.out.println('\n' + "Task no 2:");
        int[] arrayTaskTwo = {1,2,3,4,5,6,7,8,9,10};
        if(arrayTaskTwo.length < 15) {
            //ide kroz svaki ovaj broj u nizu i...
            for (int i = 0; i < arrayTaskTwo.length; i++) {
                //..za svaki taj broj printa cijeli niz.
                //j=0+i pokazuje odakle kreće niz (index->j), a on se povećava za i jer u drugoj
                // iteraciji ne želimo da krene od nultog indexa, nego prvog (u suprotnom bi 10x printao niz)
                for (int j = 0 + i; j < arrayTaskTwo.length; j++) {
                    System.out.print(arrayTaskTwo[j] + " ");
                }
                System.out.println(" ");
            }
        }


        //Zadatak 3
        System.out.println("\n" + "Task no 3:");
        int[] flipTheArray = {1,2,3,4,5,6,7};
        int[] storeFlipedArray = new int[flipTheArray.length]; //storala sam u novi array (jer ce nam to trebati u zadatku 4)

        int j=0; //ovo nam služi ko index gdje ćemo stavljati brojeve iz flipTheArray (ne možemo korisititi i jer dobijamo isti niz)
        //i ne kreće od 0, jer želimo obrnuti redosljed, zato kreće od zadnjeg (length-1)
        for(int i=flipTheArray.length-1; i>=0; i--){
            storeFlipedArray[j] = flipTheArray[i];
            j=j+1;
        }

        for(int i=0; i<flipTheArray.length; i++){
            System.out.print(storeFlipedArray[i]);
        }
        System.out.println(" ");


        //Zadatak 4
        System.out.println('\n' + "Task no 4:");
        String myPalindrome = "hannah";
        char[] charPalindrome = myPalindrome.toCharArray();
        char[] flipMyPalindrome = new char[charPalindrome.length]; //pravim novi niz charova za flipped palindrom
        char[] storeGuesses = new char[charPalindrome.length]; //novi niz s charovima, koji će prikazati 'y'
        // gdje se poklapaju charovi tog indexa od ta dva arraya, i 'n' gdje se ne poklapaju

        int d=0;
        for(int i=myPalindrome.length()-1; i>=0; i--){
            flipMyPalindrome[d] = charPalindrome[i]; //pravimo fliped array (tj array za obrnutu riječ)
            d=d+1;
        }

        for(int i=0; i<charPalindrome.length; i++){
            System.out.print(flipMyPalindrome[i]);
        }
        System.out.println(" ");//provjeravam jel dobro flipao

        int flag=0; //stavila da nekako mogu 'označiti' ako imamo 'n', tj nepoklapanje charova
        //poredi originalni array i flipped array, i ako su isti pišemo 'y', ako ne pisemo 'n'
        for(int i=0; i<=myPalindrome.length()-1; i++){
            if (charPalindrome[i] == flipMyPalindrome[i]) {
                storeGuesses[i] = 'y';
            }
            else {
                storeGuesses[i] = 'n';
                flag = flag+1; //ako bude imao 'n', flag će biti minimalno 1
            };
        }

        if(flag>=1){
            System.out.println("Not a palindrome");
        }
        else {
            System.out.println("It is a palindrome");
        }
        System.out.print(" ");


        //Zadatak 5
        System.out.println('\n' + "Task no 5:");
        Scanner firstnum = new Scanner(System.in);
        Scanner secondnum = new Scanner(System.in);

        System.out.println("Please enter lower number in range: ");
        int lowernum = firstnum.nextInt();

        System.out.println("Please enter higher number in range: ");
        int highernum = secondnum.nextInt();

        System.out.println("Even numbers for range " + lowernum + " to " + highernum + " are: ");

        for(int i=lowernum+1; i<highernum; i++){ //obicni loop, ide od min do max
            if (i%2==0){ //i provjerava jel even
                System.out.println(i);
            }
        }

        //Zadatak 6
        System.out.println('\n' + "Task no 6:");
        int[] prviNiz = {8,9,8}; //imenujem ih na bos jer u narednom zadatku su na eng
        int[] drugiNiz = {9,1,1,2};
        int[] treciNiz = {0,2,3,4,5,6};
        int[] theBigArray = new int[prviNiz.length+drugiNiz.length+treciNiz.length]; //pravi novi niz duzine zbira ovih 3

        //samo prviNiz u theBigArray niz
        for(int i=0; i<prviNiz.length; i++){
            theBigArray[i] = prviNiz[i];
            System.out.print(theBigArray[i]);
        }

        //iterira kroz drugiNiz ALI ne stavlja ih u theBigArray od 0, (jer su tu vec smjesteni elementi od prvog niza),
        //nego od 0+duzina prvog niza; z koristimo da iteriramo kroz drugiNiz (ne mozemo koristiti i jer mu je promjenjena vrijednost)
        int z=0;
        for(int i=prviNiz.length; i<prviNiz.length+drugiNiz.length; i++){
            theBigArray[i] = drugiNiz[z];
            System.out.print(theBigArray[i]);
            z=z+1;
        }

        //ista logika ko za smjestane drugog niza u theBigArray
        int k=0;
        for(int i=treciNiz.length; i<prviNiz.length+drugiNiz.length+treciNiz.length-1; i++){
            theBigArray[i] = treciNiz[k];
            System.out.print(theBigArray[i]);
            k=k+1;
        }
        System.out.println(" ");


        //Zadatak 7
        System.out.println('\n' + "Task no 7:");
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {1,1,1,1,1,1};

        //gleda koji je niž duži da bi napravio treći novi niz koji će biti dužine tog većeg
        int length = 0;
        if(firstArray.length >= secondArray.length){
            length = firstArray.length;
        }
        else{
            length = secondArray.length;
        }
        int[] sumedArray = new int[length];

        //Provjerava prvo koji je niz od ta dva veći
        if(secondArray.length>=firstArray.length) {
            for(int i=0; i<length; i++){
                if (i<=firstArray.length-1) { //sve dok ne zavšimo iteraciju manjeg niza...
                    sumedArray[i] = firstArray[i] + secondArray[i]; //..on će sabirati intove istog indexa i storat ih u summedArray
                }
                else{
                    sumedArray[i] = secondArray[i]; //kad zavrsimo s iteracijom i kroz kraći i ne ostane nam elemenata
                    // da sabiramo, on će samo prepisati preostale
                }
                System.out.print(sumedArray[i]);
            }
        }
        else{
            for(int i=0; i<length; i++){
                if (i<=secondArray.length-1) {
                    sumedArray[i] = firstArray[i] + secondArray[i];
                } else {
                    sumedArray[i] = firstArray[i];
                }
            }
        }

        for(int i=0; i<sumedArray.length; i++){
            System.out.print(sumedArray[i]);
        }
        System.out.println(" ");


        //Zadatak 8
        System.out.println('\n' + "Task no 8:");
        String[] myString = {"khjg", "hello", "how", "are", "you", "mngh", "blbllb", "hihi", "SO"};
        //pravim novi array u koji cu staviti ove riječi koje imao aeiou, length novog može max biti ko dužina originalnog

        String[] newArray = new String[myString.length];
        int s=0;
        for(int i=0; i<myString.length; i++){ //ide kroz array stringova i od svakog stringa pravi array charova
            char[] makeItArray = myString[i].toCharArray();
            //char[] charPalindrome = myPalindrome.toCharArray();
            for (int h=0; h<makeItArray.length; h++) { //od svakog arraya charova (od stringa) provjerava ima li aeiou
                if (makeItArray[h] == 'a' || makeItArray[h] == 'e' || makeItArray[h] == 'i' || makeItArray[h] == 'o' || makeItArray[h] == 'u' ||
                        makeItArray[h] == 'A' || makeItArray[h] == 'E' || makeItArray[h] == 'I' || makeItArray[h] == 'O' || makeItArray[h] == 'U') {
                    System.out.println(myString[i]);
                    h=makeItArray.length-1;//jer ako ovo ne stavimo onda će on za svaki samoglasnik u toj riječi
                    // ponoviti tu riječ, npr 2x ce printati hello, jer tu ima 2 samoglasnika,
                    // tako da cim se pojavi prvi samoglasnik, on pekida loop
                }
            }
        }


        //Zadatak 9
        System.out.println('\n' + "Task no 9:");
        int[] ArrayOne = {1, 2, 3};
        int[] ArrayTwo = {1, 2, 3};

        int sum = 0; //sum stavljamo na 0, onda će se on promijeniti u loopu, i na kraju loopa izbacuje novu vrijednost
        for (int i = 0; i < ArrayOne.length; i++) { //za svaki element u prvom nizu, ce sabrati svaki element u drugom nizu
            for (int f = 0; f < ArrayTwo.length; f++) {
                sum = sum + ArrayOne[i] + ArrayTwo[f];
            }
        }
        System.out.println("The sum is: " + sum);


    }
}