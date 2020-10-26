package xyz.jekd.bucketsort;

public class BucketSort {

    // BucketSort 我认为更多是一种"因为内存不足以一次性加载全部待排序的数据, 需要分几次排序" 的设计思路
    // 它是一种外部循环的"预处理"手段, 把待排序的大量数据, 分散成 n 个有序的 buckets, 那么每个 bucket 里面的数据就少了, 可以一次性加载到内存排序
    //而数据最好是分布比较均匀的, 那么它就是 O(n) 的排序算法; 否则如果聚集到一个 bucket 里, 那就退化为 O(nlogn) 的排序算法了
}
