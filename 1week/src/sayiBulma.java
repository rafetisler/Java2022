import java.util.Iterator;

public class sayiBulma {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 3, 4, 9, 5, 8, 7 };
		int aranacak = 6;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}
		}

		if (varMi) {
			System.out.println("Say� Mevcuttur.");
		} else {
			System.out.println("Say� Mevcut De�ildir.");
		}

	}

}
