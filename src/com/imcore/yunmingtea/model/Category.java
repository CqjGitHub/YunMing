package com.imcore.yunmingtea.model;

public class Category {
	// 实体类注意事项
	// 1.访问修饰符必须是public
	// 2.字段名称得跟JSON字符串中相应的key一致，包括大小写
	// 3.注意JSON字符串中的value的类型，带双引号
	public String id;
	public String categoryName;
	public String description;
	public String imageUrl;
	public String parentId;
	public String displayName;
	public String updatedTime;
	public String createdTime;
	public String status;

}
