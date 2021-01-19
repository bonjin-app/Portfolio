package kr.co.bonjin.portfolio.common.util;

public enum SystemPropertyKey {

    Authorization("Authorization");

    private final String value;

    SystemPropertyKey(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}