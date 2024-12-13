package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class DocStoreVO implements Serializable {

  private static final long serialVersionUID = -3275620854006525054L;

  private Long id;

  private Long cmsDocId;

  private String docUId;

  private String s3FilePath;

  private String fileName;

  private String standardName;

  private String categoryName;

  private byte[] byteArrayResource;

}
