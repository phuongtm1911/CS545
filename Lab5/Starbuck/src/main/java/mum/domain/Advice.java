package mum.domain;

import java.io.Serializable;

public class Advice implements Serializable {
    private static final long serialVersionUID = 3678107792576131001L;
    private String roast;
    private String advice;

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
