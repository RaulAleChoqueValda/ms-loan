package arquitectura.software.msloan.service;

import arquitectura.software.msloan.dto.ClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@FeignClient("ms-client")
public interface ClientService {
    @RequestMapping("v1/api/client/details")
    public List<?> getClients();
}
