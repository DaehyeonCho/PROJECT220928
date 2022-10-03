import java.util.Scanner;

class Player{
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class OpenChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇 명입니까?>>");
		int numofplayer = scanner.nextInt();
		
		Player [] player = new Player[numofplayer];
		
		for(int i = 0; i < numofplayer; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			player[i] = new Player();
			player[i].setName(name);
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		String word = "아버지";
		
		boolean flag = true;
		while(flag) {
			for(int i = 0; i < player.length; i++) {
				System.out.print(player[i].getName() + ">>");
				String word2 = scanner.next();
				int lastIndex = word.length() - 1;
				char lastChar = word.charAt(lastIndex);
				char firstChar = word2.charAt(0);
				
				if(lastChar == firstChar) {
					word = word2;
				}else {
					System.out.println(player[i].getName() + "이(가) 졌습니다.");
					flag = false;
					break;
				}
			}
		}
	}

}
