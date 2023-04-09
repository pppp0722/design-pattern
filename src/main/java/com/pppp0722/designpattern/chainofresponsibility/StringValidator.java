package com.pppp0722.designpattern.chainofresponsibility;

public class StringValidator {

    private final ChainValidator<String> chainValidator;

    public StringValidator(String objectToValidate) {
        chainValidator = new ChainValidator<>(objectToValidate)
            .next(this::isFiveCharsString, () -> {
                System.out.println("5글자가 아닙니다.");
                throw new RuntimeException("글자 수 검증 실패");
            })
            .next(this::startsWithCharA, () -> {
                System.out.println("'A' 혹은 'a'로 시작하지 않습니다.");
                throw new RuntimeException("시작 알파벳 검증 실패");
            });
    }

    public void execute() {
        chainValidator.execute();
    }

    private boolean isFiveCharsString(String objectToValidate) {
        return objectToValidate.length() == 5;
    }

    private boolean startsWithCharA(String objectToValidate) {
        return Character.toLowerCase(objectToValidate.charAt(0)) == 'a';
    }
}
