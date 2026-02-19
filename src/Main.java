
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		String[] russianWords = {
				"человек",
				"мужчина",
				"женщина",
				"ребёнок",
				"мама",
				"папа",
				"брат",
				"сестра",
				"друг",
				"подруга",
				"дом",
				"квартира",
				"комната",
				"дверь",
				"окно",
				"стол",
				"стул",
				"кровать",
				"телефон",
				"компьютер",
				"вода",
				"чай",
				"кофе",
				"молоко",
				"хлеб",
				"сыр",
				"мясо",
				"рыба",
				"яблоко",
				"суп"
				
		};
		
		String[] englishWords = {
				"person",
				"man",
				"woman",
				"child",
				"mom",
				"dad",
				"brother",
				"sister",
				"friend (male)",
				"friend (female)",
				"house",
				"apartment",
				"room",
				"door",
				"window",
				"table",
				"chair",
				"bed",
				"phone",
				"computer",
				"water",
				"tea",
				"coffee",
				"milk",
				"bread",
				"cheese",
				"meat",
				"fish",
				"apple",
				"soup"
		};
		
		int score = 0;
		
		System.out.println("=== Russian Vocabulary Trainer ===");
		
		for(int i = 0; i < 5; i++) {
			
			int index  = random.nextInt(russianWords.length);
			
			System.out.println("\nTranslate: " + russianWords[index]);
			System.out.print("Your answer: ");
			
			String answer = scanner.nextLine();
			
			if(answer.equalsIgnoreCase(englishWords[index])) {
				System.out.println("Correct!");
				score++;
			} else {
				System.out.println("Wrong! Correct answer: " + englishWords[index]);
			}
			
			
		}
		
		System.out.println("\nFinal Score: " + score + "/5");
		
		scanner.close();
		

	}

}
