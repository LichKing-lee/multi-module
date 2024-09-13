package com.yong.subdomain.kernel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KernelService {
    private KernelRepository kernelRepository;

    public KernelService(KernelRepository kernelRepository) {
        this.kernelRepository = kernelRepository;
    }

    public List<Kernel> kernels() {
        return kernelRepository.findAll();
    }
}
