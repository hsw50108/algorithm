class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int[] leftHandPosition = {3, 0}; 
        int[] rightHandPosition = {3, 2}; 

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftHandPosition = getCoords(number);

            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightHandPosition = getCoords(number);

            } else {
                int[] targetCoords = getCoords(number);

                int leftDistance = Math.abs(leftHandPosition[0] - targetCoords[0]) + Math.abs(leftHandPosition[1] - targetCoords[1]);
                int rightDistance = Math.abs(rightHandPosition[0] - targetCoords[0]) + Math.abs(rightHandPosition[1] - targetCoords[1]);

                if (leftDistance < rightDistance) {
                    answer += "L";
                    leftHandPosition = targetCoords;
                } else if (rightDistance < leftDistance) {
                    answer += "R";
                    rightHandPosition = targetCoords;
                } else { 
                    if (hand.equals("right")) {
                        answer += "R";
                        rightHandPosition = targetCoords;
                    } else {
                        answer += "L";
                        leftHandPosition = targetCoords;
                    }
                }
            }
        }
        return answer;
    }

    private static int[] getCoords(int number) {
        if (number == 0) {
            return new int[]{3, 1}; 
        }

        return switch (number) {
            case 1 -> new int[]{0, 0};
            case 2 -> new int[]{0, 1};
            case 3 -> new int[]{0, 2};
            case 4 -> new int[]{1, 0};
            case 5 -> new int[]{1, 1};
            case 6 -> new int[]{1, 2};
            case 7 -> new int[]{2, 0};
            case 8 -> new int[]{2, 1};
            case 9 -> new int[]{2, 2};
            default -> null;
        };

    }
}