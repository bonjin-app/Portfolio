package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.dto.ReplyResponseDto;
import kr.co.bonjin.portfolio.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyRepository replyRepository;


    @Override
    public List<ReplyResponseDto> findAll() {

        List<Reply> works = replyRepository.findAll();

        List<ReplyResponseDto> result = works.stream()
                .map(ReplyResponseDto::new)
                .collect(Collectors.toList());

        return result;
    }

    @Transactional
    @Override
    public Long save(Reply reply) {
        replyRepository.save(reply);
        return reply.getId();
    }
}
