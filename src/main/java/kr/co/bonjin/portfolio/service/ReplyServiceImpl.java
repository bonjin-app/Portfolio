package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyRepository replyRepository;

    @Transactional
    @Override
    public Long save(Reply reply) {
        replyRepository.save(reply);
        return reply.getId();
    }
}
