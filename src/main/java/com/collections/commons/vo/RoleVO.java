package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author rupasrim
 */
@Data
public class RoleVO implements Serializable {

	private static final long serialVersionUID = -3909950579696035463L;

	private Long id;

	private String name;

	private LocalDateTime lastModifiedDate;

}
