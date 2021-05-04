package utils;

public enum Message {
    ASK_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분\n"),
    ASK_TIMES("시도할 횟수는 몇회인가요?\n"),
    START("\n실행 결과\n"),
    RESULT("가 최종 우승했습니다.\n");

    final private String message;

    private Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
