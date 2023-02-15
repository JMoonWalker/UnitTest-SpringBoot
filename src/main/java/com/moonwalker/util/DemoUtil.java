package com.moonwalker.util;

import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;

@Getter
public class DemoUtil {

    private final String ACADEMY = "Luv2Code Academy";
    private final String ACADEMY_DUPLICATE = ACADEMY;
    private final String[] DEMO_ARRAY = {"A", "B", "C"};
    private final List<String> DEMO_LIST = List.of("A", "B", "C");
    private final BigDecimal MONEY = new BigDecimal(300);

    public int add(int first, int second) {
        return first + second;
    }

    public Object checkNull(Object o) {
        return o;
    }

    public boolean isGreater(int first, int second) {
        return first > second;
    }

    public String payPrice(BigDecimal price) throws Exception {
        if (price.compareTo(MONEY) == 1) {
            throw new Exception("");
        }
        return "paid successfully";
    }
}
