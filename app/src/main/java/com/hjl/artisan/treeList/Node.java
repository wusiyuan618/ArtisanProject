package com.hjl.artisan.treeList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Node implements Serializable {
	/**
	 * 节点id
	 */
	private int id;
	/**
	 * 父节点id
	 */
	private int pId;
	/**
	 * 是否展开
	 */
	private boolean isExpand = false;
	private boolean isChecked = false;
	private boolean isHideChecked = true;
	/**
	 * 节点名字
	 */
	private String name;
	/**
	 * 节点级别
	 */
	private int level;
	/**
	 * 节点展示图标
	 */
	private int icon;
	/**
	 * 节点所含的子节点
	 */
	private List<Node> childrenNodes = new ArrayList<Node>();
	/**
	 * 节点的父节点
	 */
	private Node parent;
	private Object data;
	private Float qualifiendProbability;
	public Node() {
	}

	public Node(int id, int pId, String name) {
		super();
		this.id = id;
		this.pId = pId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public boolean isExpand() {
		return isExpand;
	}

	/**
	 * 当父节点收起，其子节点也收起
	 * @param isExpand
	 */
	public void setExpand(boolean isExpand) {
		this.isExpand = isExpand;
		if (!isExpand) {

			for (Node node : childrenNodes) {
				node.setExpand(isExpand);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return parent == null ? 0 : parent.getLevel() + 1;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public List<Node> getChildrenNodes() {
		return childrenNodes;
	}

	public void setChildrenNodes(List<Node> childrenNodes) {
		this.childrenNodes = childrenNodes;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	/**
	 * 判断是否是根节点
	 * 
	 * @return
	 */
	public boolean isRoot() {
		return parent == null;
	}

	/**
	 * 判断是否是叶子节点
	 * 
	 * @return
	 */
	public boolean isLeaf() {
		return childrenNodes.size() == 0;
	}
	

	/**
	 * 判断父节点是否展开
	 * 
	 * @return
	 */
	public boolean isParentExpand()
	{
		if (parent == null)
			return false;
		return parent.isExpand();
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public boolean isHideChecked() {
		return isHideChecked;
	}

	public void setHideChecked(boolean isHideChecked) {
		this.isHideChecked = isHideChecked;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Float getQualifiendProbability() {
		return qualifiendProbability;
	}

	public void setQualifiendProbability(Float qualifiendProbability) {
		this.qualifiendProbability = qualifiendProbability;
	}
}
