package com.collections.commons.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @author rupasrim
 */
@Data
public class DocumentVO implements Serializable {

	private static final long serialVersionUID = -8836105887572745387L;

	private Long id;

	private String name;

	private String description;

	private Integer version;

	private Double basePrice;

	private Double discount;

	private Double netPrice;

	private Long categoryId;

	private Long standardCategoryId;

	private String categoryName;

	private String status;

	private List<Long> colStandardIds;

	private List<DocumentLocationVO> locations;

	private Long cmsDocId;

	private Long cmsStandardCategoryId;

	private String docLocation;

	private Boolean isEnable;

	private String fileName;

	private CategoryVO eshopCategoryVO;

	private List<StandardVO> eshopStandardVOList;

	private String standardName;

	private Long standardId;

}
