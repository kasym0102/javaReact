package com.Entity;

import com.Repository.LogIdentifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="logdb")
public class Log {

    @EmbeddedId
    private LogIdentifier logIdentifier;

}
