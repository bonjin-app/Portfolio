package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Service;
import lombok.Data;

import java.util.List;

@Data
public class ServiceResponseDto {

    private String icon;

    private String title;

    private String content;

    private List<String> items;

    public ServiceResponseDto(Service service) {
        this.icon = service.getIcon();
        this.title = service.getTitle();
        this.content = service.getConten();
        this.items = service.getItems();
    }
}
