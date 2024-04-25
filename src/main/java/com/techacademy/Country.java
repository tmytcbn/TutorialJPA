package com.techacademy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 「getter/setter、toString、hashCode、equals」のメソッドを生成
@AllArgsConstructor // すべてのフィールドを引数に持つコンストラクタを生成
@NoArgsConstructor // 引数を持たないコンストラクタを生成
@Entity // エンティティクラス（データベースのテーブルにマッピングするクラス）であることを示す
@Table(name="country") // 対応するテーブル名を指定
public class Country {
    @Id // 主キーであることを示す
    private String code;
    private String name;
    private int population;
}
