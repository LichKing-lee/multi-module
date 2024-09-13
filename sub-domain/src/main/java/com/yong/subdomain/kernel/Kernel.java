package com.yong.subdomain.kernel;

import jakarta.persistence.*;

@Entity
@Table
public class Kernel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kernel_id")
    private Long id;
}
