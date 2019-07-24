package mum.repository;

import java.util.List;

public interface AdviceRepository {
    public List<String> getRoast();
    public List<String> getAdvice(String roast);
}
