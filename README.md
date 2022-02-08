# 概要

このプロジェクトはSpring BootのThymeleafを用いたラジオボタンのあるフォームを送信することを扱うサンプルレポジトリです。

# 前提
- Java 11
- Spring Boot 2.6.3

# Getting Started

`$ git clone https://github.com/yoshi-koyama/radio-button.git`

`$ cd radio-button`

`$ ./gradlew bootRun`

※お使いのIDEから実行しても大丈夫です。

起動成功時のイメージ
<img width="1440" alt="スクリーンショット 2022-02-08 16 59 12" src="https://user-images.githubusercontent.com/62045457/152943189-9411a7f9-c168-4fd7-bda5-1c74aa9803a0.png">

`http://localhost:8080/form`にアクセスするとラジオボタンのフォームが表示される

<img width="416" alt="スクリーンショット 2022-02-08 17 03 43" src="https://user-images.githubusercontent.com/62045457/152943731-3a082b12-c63c-4d2d-a1a6-925a9b23997f.png">

好きな言語を選択してSubmitボタンを押下
以下画面に遷移する

<img width="272" alt="スクリーンショット 2022-02-08 17 03 53" src="https://user-images.githubusercontent.com/62045457/152943756-a3769924-3092-45e8-a9a3-cbe1e269a6a7.png">

`return to form`をクリックするとラジオボタンのフォームが表示される

（`./gradlew bootRun`コマンドで実行している場合）`ctrl + c`で終了する。
