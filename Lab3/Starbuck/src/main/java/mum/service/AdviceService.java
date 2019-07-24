package mum.service;

import java.util.List;

public interface AdviceService {
    public List<String> getRoast();
    public List<String> getAdvice(String roast);
}
