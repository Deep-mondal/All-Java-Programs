package TCS_CODE_VITA;
import java.util.Scanner;

public class Orchad1 {
    public static String determineWinner(String ashokRow, String anandRow) {
        int ashokPossibilities = countPossibilities(ashokRow);
        int anandPossibilities = countPossibilities(anandRow);

        if (ashokPossibilities > anandPossibilities) {
            return "Ashok";
        } else if (ashokPossibilities < anandPossibilities) {
            return "Anand";
        } else {
        	System.out.print(ashokPossibilities);
        	System.out.print(anandPossibilities);
            return "Draw";
        }
    }
    public static int countPossibilities(String row) {
        int possibilities = 0;
        for (int i = 0; i < row.length() - 2; i++) {
            if (row.charAt(i) != row.charAt(i + 1) || row.charAt(i + 1) != row.charAt(i + 2)) {
                possibilities++;
            }
        }
        return possibilities;
    }
	public static boolean invalidKey(String demo) {
		boolean att=false;
		for(int i=0;i<demo.length();i++) {
			if(demo.charAt(i)=='M'||demo.charAt(i)=='L') {
				continue;
			}
			else {
				
				att=true;
				break;
			}
		}
		return att;
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ashokRow = scanner.nextLine();
        boolean p=Orchad1.invalidKey(ashokRow);
    	if(p==true){
			System.out.println("Invalid input");
		}
        String anandRow = scanner.nextLine();
        boolean q=Orchad1.invalidKey(anandRow);
    	if(q==true){
			System.out.println("Invalid input");
		}

        String result = determineWinner(ashokRow, anandRow);
        System.out.println(result);

        scanner.close();
    }



 
}
