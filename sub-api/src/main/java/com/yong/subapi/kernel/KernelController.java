package com.yong.subapi.kernel;

import com.yong.subdomain.kernel.Kernel;
import com.yong.subdomain.kernel.KernelRepository;
import com.yong.subdomain.kernel.KernelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KernelController {
    private KernelService kernelService;

    public KernelController(KernelService kernelService) {
        this.kernelService = kernelService;
    }

    @GetMapping("/api/kernels")
    private List<Kernel> retrieve() {
        return kernelService.kernels();
    }
}
