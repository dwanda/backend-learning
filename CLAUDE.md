# Backend Learning — CLAUDE.md

> 仓库：https://github.com/dwanda/backend-learning
> 学习者：dwanda
> 目标：系统掌握企业级后端技术栈，达到独立开发微服务架构应用的能力

## 技术栈

| 领域 | 技术 | 应用场景 |
|------|------|----------|
| 语言基础 | Java 21 | 所有后端开发的基础 |
| 构建工具 | Maven | 项目构建、依赖管理 |
| 框架核心 | Spring Boot 3.4 | 快速构建独立应用 |
| 数据存储 | MySQL 8.0 | 核心业务数据持久化 |
| 缓存 | Redis 6.x | 缓存 / 会话 / 分布式锁 |
| 微服务 | Spring Cloud | 微服务治理 |
| 阿里生态 | Spring Cloud Alibaba | 阿里云微服务 |
| 注册配置 | Nacos 2.0 | 服务注册发现 + 配置中心 |
| 消息队列 | RabbitMQ | 异步消息、事件驱动 |
| 搜索引擎 | Elasticsearch 8.x | 全文检索、日志分析 |
| 对象存储 | FDS | 文件/文档/报告存储 |
| 流式处理 | Talos | 流式数据处理 |
| 设计思想 | DDD（领域驱动设计） | 复杂业务建模 |

## 目录结构

```
backend-learning/
├── CLAUDE.md                   # Agent 指令（本文件）
├── README.md                   # 仓库总览
├── learning-plan/
│   └── plan.md                 # 完整学习计划（逐 Phase）
├── notes/                      # 知识点总结（Markdown）
│   ├── java-21-notes.md
│   ├── mysql-notes.md
│   ├── redis-notes.md
│   ├── spring-boot-notes.md
│   ├── nacos-notes.md
│   ├── spring-cloud-notes.md
│   ├── cloud-alibaba-notes.md
│   ├── rabbitmq-notes.md
│   ├── elasticsearch-notes.md
│   ├── ddd-notes.md
│   ├── fds-notes.md
│   └── talos-notes.md
├── code/                       # 代码实战（按技术分目录）
│   ├── java-basics/            # Java 21 特性演示代码
│   ├── maven-demo/             # Maven 多模块示例
│   ├── spring-boot-demo/       # Spring Boot 实战项目
│   ├── spring-cloud-demo/      # 微服务示例（多模块）
│   ├── alibaba-demo/           # 阿里微服务全套整合
│   ├── rabbitmq-demo/          # RabbitMQ 集成示例
│   ├── es-demo/                # ES 集成与查询示例
│   ├── ddd-demo/               # DDD 实战示例
│   ├── fds-demo/               # FDS 集成示例
│   └── talos-demo/             # Talos 集成示例
└── teaching/                   # 教学 HTML 文档
    ├── redis-cache-strategies.html
    ├── mysql-index-explainer.html
    ├── spring-boot-architecture.html
    ├── microservice-architecture.html
    ├── rabbitmq-messaging.html
    ├── elasticsearch-search.html
    └── ddd-modeling.html
```

## 学习计划概览

### Phase 1：Java 21 + Maven（基础夯实，2-3 周）
- Java 21 新特性：Record、Sealed Class、Pattern Matching、Virtual Threads
- 函数式编程：Lambda、Stream API、Optional
- 并发编程：线程池、CompletableFuture、Virtual Threads
- Maven 核心：POM、生命周期、依赖管理、多模块构建
- **产出：** `code/java-basics/`、`code/maven-demo/`

### Phase 2：MySQL 8.0 + Redis 6.x（数据层，3-4 周）
- MySQL 进阶：索引优化、SQL 执行计划、事务隔离级别、MVCC
- MySQL 实战：表设计、分库分表策略、慢查询优化
- Redis 核心：数据类型、持久化、过期策略、分布式锁
- Redis 高级：缓存穿透/击穿/雪崩、Redisson
- **产出：** `notes/mysql-notes.md`、`notes/redis-notes.md`、教学 HTML

### Phase 3：Spring Boot 3.4（框架核心，3-4 周）
- IoC 容器、AOP、Bean 生命周期
- 自动配置、起步依赖、Actuator
- Spring Data JPA / MyBatis-Plus 集成
- 统一异常处理、参数校验、日志框架
- 单元测试与集成测试（JUnit 5 + Mockito）
- **产出：** `code/spring-boot-demo/`、`notes/spring-boot-notes.md`

### Phase 4：Nacos + Spring Cloud（微服务入门，3-4 周）
- Nacos 搭建（单机与集群）、服务注册与发现、配置中心
- Spring Cloud Gateway、OpenFeign、Sentinel
- **产出：** `code/spring-cloud-demo/`、`notes/nacos-notes.md`、`notes/spring-cloud-notes.md`

### Phase 5：Spring Cloud Alibaba（阿里生态集成，2-3 周）
- Seata 分布式事务、RocketMQ、Alibaba Cloud 集成
- **产出：** `code/alibaba-demo/`

### Phase 6：RabbitMQ（消息驱动，2-3 周）
- Exchange / Queue / Binding / Routing Key
- Direct / Topic / Fanout / Headers
- 生产者确认、消费者确认、死信队列
- **产出：** `code/rabbitmq-demo/`、教学 HTML

### Phase 7：Elasticsearch 8.x（搜索与分析，3-4 周）
- 索引、分片、映射、分词、DSL 查询
- ELK 集成、Spring Data Elasticsearch
- **产出：** `code/es-demo/`、教学 HTML

### Phase 8：DDD（思想进阶，3-4 周）
- 实体、值对象、聚合、领域事件
- 战略设计（限界上下文）、战术设计（Repository、Factory）
- **产出：** `code/ddd-demo/`、教学 HTML

### Phase 9：FDS 文件存储（1-2 周）
- 对象存储概念、FDS SDK 接入、文件上传/下载
- **产出：** `code/fds-demo/`

### Phase 10：Talos 流式数据处理（2-3 周）
- Source / Sink / Transform、实时 Pipeline
- **产出：** `code/talos-demo/`

**总预计耗时：约 24-34 周（6-8 个月）**

## 学习建议

1. **循序渐进**：按 Phase 顺序学习，前面的知识是后续的基础
2. **动手实践**：每个模块学完都要写代码，代码存放在 `code/` 目录
3. **输出倒逼输入**：写知识点总结（`notes/`）和教学文档（`teaching/`），能教别人才算真正学会
4. **Git 记录成长**：每次学习都有 commit 记录，形成完整的学习轨迹
5. **遇到问题**：先尝试自己解决（查官方文档、StackOverflow），再记入知识点
6. **不要追求完美**：不需要一次把所有内容学完，按节奏推进即可
