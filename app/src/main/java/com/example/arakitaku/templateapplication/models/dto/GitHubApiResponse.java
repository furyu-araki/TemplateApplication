package com.example.arakitaku.templateapplication.models.dto;

/**
 * GitHubAPiのレスポンス
 */
public class GitHubApiResponse {
    public static final class Repository {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("RepositoryResponse{id:%s, name:%s}", id, name);
        }
    }
}
