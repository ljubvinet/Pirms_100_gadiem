package net.ljubvi.pirms100gadiem.response


data class periodika(
    val issues: List<Issue>,
    val date: String
)

data class Issue(
    val id: Long,
    //@field:JsonProperty("periodical_id")
    val periodicalId: Long,
   // @field:JsonProperty("issue_number")
    val issueNumber: String,
    val date: String,
 //   @field:JsonProperty("articles_count")
    val articlesCount: Long,
    val sort: String,
 //   @field:JsonProperty("reader_link")
    val readerLink: String,
    val periodical: Periodical,
    val articles: List<Article>,
    val ads: List<Ad>
)

data class Periodical(
    val id: Long,
    val title: String,
  //  @field:JsonProperty("is_lva")
    val isLva: Long,
    val language: String,
    val visible: Long
)

data class Article(
    val id: Long,
 //   @field:JsonProperty("issue_id")
    val issueId: Long,
    val title: String,
    val content: String,
 //   @field:JsonProperty("share_url")
    val shareUrl: String,
    val items: List<Item>
)

data class Item(
 //   @field:JsonProperty("article_id")
    val articleId: Long,
    val begin: String,
    val url: String,
    val page: Long,
    val image: String
)

data class Ad(
    val id: Long,
  //  @field:JsonProperty("issue_id")
    val issueId: Long,
    val title: String,
    val content: String,
 //   @field:JsonProperty("share_url")
    val shareUrl: String,
    val items: List<Item>
)






