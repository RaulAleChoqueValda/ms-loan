package arquitectura.software.msloan.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("ms-book")
public interface MSBookService {
    @RequestMapping("/v1/api/books")
    public List<?> getBooks();
    
}
