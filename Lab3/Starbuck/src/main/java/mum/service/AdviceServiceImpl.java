package mum.service;

import mum.repository.AdviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {
    @Autowired
    AdviceRepository adviceRepository;

    @Override
    public List<String> getAdvice(String roast) {
        return adviceRepository.getAdvice(roast);
    }
}
