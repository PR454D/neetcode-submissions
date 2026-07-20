class Tweet {
    int id;
    int time;
    public Tweet(int id, int time) {
        this.id = id;
        this.time = time;
    }
}
class Twitter {
    private final Map<Integer, List<Tweet>> tweets; // userId -> list of tweets
    private final Map<Integer, Set<Integer>> followers; // user id -> follower user ids
    private int timestamp;
    public Twitter() {
        this.tweets = new HashMap<>();
        this.followers = new HashMap<>();
        this.timestamp = 0;
    }

    public void postTweet(int userId, int tweetId) {
        this.tweets.computeIfAbsent(userId, k -> new ArrayList<>())
            .add(new Tweet(tweetId, this.timestamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Tweet> allTweets = new ArrayList<>(this.tweets.getOrDefault(userId, new ArrayList<>()));
        Set<Integer> followedUsers = this.followers.getOrDefault(userId, new HashSet<>());
        for (int followeeId : followedUsers) {
            if (followeeId != userId) {
                allTweets.addAll(this.tweets.getOrDefault(followeeId, new ArrayList<>()));
            }
        }
        allTweets.sort((a, b) -> b.time - a.time);
        return allTweets.stream().map(x -> x.id).limit(10).toList();
    }

    public void follow(int followerId, int followeeId) {
        followers.computeIfAbsent(followerId, k -> new HashSet<>())
            .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (this.followers.containsKey(followerId)) {
            this.followers.get(followerId).remove(followeeId);
        }
    }
}
