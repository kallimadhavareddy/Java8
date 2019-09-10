package com.osp.service.impl;

import com.osp.service.ApplePredicate;
import data.Apple;

import static com.osp.utils.Color.GREEN;

public class AppleGreenAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor()) && apple.getWeight()>100;
    }
}
