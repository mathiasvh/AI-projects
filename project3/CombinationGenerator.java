public class CombinationGenerator {

	int count = 0;

	public static void main(String[] args) {
		String[] list = { "NF", "HF","NB","NBB","HBB","HB"};
		CombinationGenerator cg = new CombinationGenerator();
		cg.generateCombination(list);
	}

	public void generateCombination(String[] numbers) {
		
		int NF = -1;
		int HF = -1;
		int NB = -1;
		int NBB = -1;
		int HBB = -1;
		int HB = -1;

		for (int a = 0; a < numbers.length; a++) {
			for (int b = 0; b < numbers.length; b++) {
				for (int c = 0; c < numbers.length; c++) {
					for (int d = 0; d < numbers.length; d++) {
						for (int e = 0; e < numbers.length; e++) {
							for (int f = 0; f < numbers.length; f++) {
								
								if (a==b || a==c || a ==d ||a==e || a==f ||b ==c || b==d||b==e||b==f ||c==d||c==e||c==f||d==e||d==f||e==f)
									continue;
								String[] templijst = {numbers[a], numbers[b], numbers[c], numbers[d], numbers[e], numbers[f]};
								for (int i = 0; i < 6; i++){
									switch(templijst[i]){
									case "NF": 	NF = i;
												break;
									case "HF": 	HF = i;
												break;
									case "NB": 	NB = i;
												break;
									case "NBB": NBB = i;
												break;
									case "HBB": HBB = i;
												break;
									case "HB": 	HB = i;
												break;
									}
								}
								if (NF > HF || NB > HB || NBB > HBB || (HF > HBB && HF < HB) || HBB > HB)
									continue;								
								count++;
								System.out.println("Initieel \\rightarrow " + numbers[a] + " \\rightarrow " + numbers[b] + " \\rightarrow "
										+ numbers[c] + " \\rightarrow " + numbers[d]+ " \\rightarrow " + numbers[e]
												+ " \\rightarrow " + numbers[f] + " \\rightarrow CF \\rightarrow NK \\rightarrow Doel\\");
							}
						}
						
					}
				}
			}
		}

		System.out.println("count : " + count);

	}
}
