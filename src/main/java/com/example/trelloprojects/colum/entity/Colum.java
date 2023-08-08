package com.example.trelloprojects.colum.entity;

import com.example.trelloprojects.board.entity.Board;

import jakarta.persistence.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "column")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Colum {

    @Id
    @Column(name = "column_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String name;

    @Column
    String position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;
}