public class uppg2{
    public static void main(String[] args) {
        
        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"}; 
        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};

        Under20(namn, ålder);
        Över20Under30(namn,ålder);
        Under20Över30(namn,ålder);
        ÄldstYngst(namn,ålder);
        JämnaTal(namn,ålder);
        StoppaVidFörstaÖver40(namn,ålder);

        

    }


    public static void Under20(String namn[], int ålder[])
    {
        System.out.println("\nAlla personer som är under 20: ");
        for (int i = 0; i < ålder.length; i++) {
            if(ålder[i]<20){
                System.out.println(namn[i] + ": "+ ålder[i] +" år");
            }
        }  
    }

    public static void Över20Under30(String namn[], int ålder[])
    {
        System.out.println("\nAlla personer som är över 20 & under 30: ");
        for (int i = 0; i < ålder.length; i++) {
            if(ålder[i]>20 && ålder[i]<30){
                System.out.println(namn[i] + ": "+ ålder[i] +" år");
            }
        }   
    }

    public static void Under20Över30(String namn[], int ålder[])
    {
        System.out.println("\nAlla personer som är under 20 & över 30: ");
        for (int i = 0; i < ålder.length; i++) {
            if(ålder[i]< 20 || ålder[i]>30){
                System.out.println(namn[i] + ": "+ ålder[i] +" år");
            }
        }   
    }

    public static void ÄldstYngst(String namn[], int ålder[])
    {
        int äldst = ålder[0];
        int yngst = ålder[0];
        int index1 = 0;
        int index2 = 0;
        System.out.println("\nNamn på äldsta och yngsta personen ");
        for (int i = 0; i < ålder.length; i++) 
        {
            if(ålder[i] > äldst)
            {
                äldst = ålder[i];
                index1 = i;
            }
            else if(ålder[i] < yngst){
            yngst = ålder[i];
            index2 = i;
            }
        }   
        System.out.println("Äldst "+namn[index1] + ": "+ äldst +" år"+ "\nYngst "+namn[index2] + ": "+ yngst +" år");
    }
     
    public static void JämnaTal(String namn[], int ålder[])
    {
        System.out.println("\nAlla personer vars ålder är ett jämnt tal: ");
        for (int i = 0; i < ålder.length; i++) {
            if(!(ålder[i]%2 == 0)){
                continue;
            }
            System.out.println(namn[i] + ": "+ ålder[i] +" år");
        }   
    }

    public static void StoppaVidFörstaÖver40(String namn[], int ålder[])
    {
        System.out.println("\nAlla personer vars ålder är under 40, break vid första personen över 40 ");
        for (int i = 0; i < ålder.length; i++) {
            if((ålder[i] < 40)){
                System.out.println(namn[i] + ": "+ ålder[i] +" år");
            }
            else if(ålder[i] >= 40){
                break;
                }
        }   
    }


}


/* Du ska använda && (AND), || (OR), Continue, Break, If, For eller While

Du har en lista på 10 personer, med namn och ålder. 
Du ska skriva ett program som går igenom listan med personer och skriver ut alla personer som uppfyller vissa kriterier.

1. Skriv ut alla personer som är under 20 år. 
2. Skriv ut alla personer som är 20 år och alla som är under 30 år. 
3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.
4. Visa namn och ålder på äldsta och yngsta karaktären (1 av varje)
5. Visa en lista på alla personer som har jämna tal i sin ålder
6. Visa alla namn men stoppa körningen vid första person över 40 år.

För att skona dig från tråkdelen så får du en färdig lista här som exempel:


Vid inlämning, skicka enbart in din Main.java fil, det räcker för att jag ska kunna se koden ;) 
*/