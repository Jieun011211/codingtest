public class Codingtest {
    public static void main(String[] args) {

        //테스트 1
        int[] test1 = {15, 20, 6, 10};
        animals(1, 1, 1, test1);

        //테스트 2
        int[] test2 = {26, 27, 61, 138};
        animals(1, 2, 3, test2);
    }

    static void animals(int elephant, int giraffe, int monkey, int[] box) {
        int apples = box[0];
        int strawberries = box[1];
        int bananas = box[2];
        int mandarins = box[3];

        int elephantCount = (apples + strawberries + bananas + mandarins) / 9; //코끼리가 한번에 먹을 수 있는 횟수
        int giraffeCount = (apples/5) + (strawberries/5) + (bananas/5) + (mandarins/5); //기린이 한번에 먹을 수 있는 횟수
        int monkeyCount = (apples + strawberries + bananas + mandarins) / 3; //원숭이가 한번에 먹을 수 있는 횟수

        //결과 출력
        System.out.println("코끼리(" + elephant + "마리)는 " + elephantCount * elephant + "번 먹어야 합니다.");
        System.out.println("기린(" + giraffe + "마리)은 " + giraffeCount * giraffe + "번 먹어야 합니다.");
        System.out.println("원숭이(" + monkey + "마리)는 " + monkeyCount * monkey + "번 먹어야 합니다.");
    }

    }

