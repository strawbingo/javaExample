package com.strawbingo.eight;

import com.strawbingo.eight.model.SnapshotMetadata;
import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by liubin15 on 2018/6/6.
 */
public class SteamExample {

    private static List<SnapshotMetadata> genList(){
        List<SnapshotMetadata> snapshotMetadatas = new ArrayList<>();
        SnapshotMetadata snapshotMetadata = new SnapshotMetadata();
        snapshotMetadata.setTaskType(1);
        snapshotMetadata.setSnapshotNums(10);
        snapshotMetadata.setFileSize(10);
        snapshotMetadatas.add(snapshotMetadata);

        snapshotMetadata = new SnapshotMetadata();
        snapshotMetadata.setTaskType(1);
        snapshotMetadata.setSnapshotNums(25);
        snapshotMetadata.setFileSize(32);
        snapshotMetadatas.add(snapshotMetadata);

        snapshotMetadata = new SnapshotMetadata();
        snapshotMetadata.setTaskType(2);
        snapshotMetadata.setSnapshotNums(20);
        snapshotMetadata.setFileSize(30);
        snapshotMetadatas.add(snapshotMetadata);

        snapshotMetadata = new SnapshotMetadata();
        snapshotMetadata.setTaskType(2);
        snapshotMetadata.setSnapshotNums(2);
        snapshotMetadata.setFileSize(2);
        snapshotMetadatas.add(snapshotMetadata);

        return snapshotMetadatas;
    }
    public static void main(String[] args) {
        List<SnapshotMetadata> snapshotMetadatas = genList();

        Stream<SnapshotMetadata> stream = snapshotMetadatas.stream();

        //求和
        snapshotMetadatas.stream().collect(Collectors.summingInt(SnapshotMetadata::getSnapshotNums));

        List<Integer>  collect = stream.map(SnapshotMetadata::getSnapshotNums).collect(Collectors.toList());
        collect.stream().forEach(mon->System.out.println(mon));

        Map<Integer, List<SnapshotMetadata>> collect1 = snapshotMetadatas.stream().collect(Collectors.groupingBy(SnapshotMetadata::getTaskType, Collectors.toList()));

        for(Map.Entry<Integer, List<SnapshotMetadata>>  entry: collect1.entrySet()){

        }

        Map<Integer, List<SnapshotMetadata>> collect2 = snapshotMetadatas.stream().collect(Collectors.groupingBy(SnapshotMetadata::getTaskType));

        return;
    }


    private void test(){
        List<String> list1 = Lists.newArrayList();
        List<String> list2 = Lists.newArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        list2 = list1.stream().map(string -> {
            return "stream().map()处理之后：" + string;
        }).collect(Collectors.toList());

        list2.stream().forEach(string -> {
            System.out.println(string);
        });
    }
}
