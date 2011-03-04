/*
 * Copyright 2011 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.redis.samples.retwis.web;

import org.springframework.data.redis.samples.Post;

/**
 * DTO suitable for presenting a Post through the Web UI.
 * 
 * @author Costin Leau
 */
public class WebPost {

	private String content;
	private String name;
	private String replyTo;
	private String replyPid;

	/**
	 * Returns the replyPid.
	 *
	 * @return Returns the replyPid
	 */
	public String getReplyPid() {
		return replyPid;
	}

	/**
	 * @param replyPid The replyPid to set.
	 */
	public void setReplyPid(String replyPid) {
		this.replyPid = replyPid;
	}

	private String pid;
	private String time;

	public WebPost() {
	}

	public WebPost(Post post) {
		this.time = WebUtils.timeInWords(Long.valueOf(post.getTime()));
		this.replyPid = post.getReplyPid();
	}

	/**
	 * Returns the name.
	 *
	 * @return Returns the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the replyTo.
	 *
	 * @return Returns the replyTo
	 */
	public String getReplyTo() {
		return replyTo;
	}

	/**
	 * Returns the content.
	 *
	 * @return Returns the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content The content to set.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Returns the pid.
	 *
	 * @return Returns the pid
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * @param pid The pid to set.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * Returns the time.
	 *
	 * @return Returns the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time The time to set.
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @param replyTo The replyTo to set.
	 */
	public void setReplyTo(String replyName) {
		this.replyTo = replyName;
	}

	public Post asPost() {
		Post post = new Post();
		post.setReplyPid(replyPid);
		post.setContent(content);
		return post;
	}

	@Override
	public String toString() {
		return "WebPost [content=" + content + ", name=" + name + ", pid=" + pid + ", replyTo=" + replyTo
				+ ", replyPid=" + replyPid + ", time=" + time + "]";
	}
}