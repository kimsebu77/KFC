package com.kfc.fight.traning;

import com.kfc.fight.busang.ankle;

public class 맷집 {
    void print(){
        System.out.println("[내구력 훈련 가이드]");
        System.out.println("목적: 피로 상황에서도 자세와 호흡을 유지하는 능력 강화");
        System.out.println();
        System.out.println("추천 훈련:");
        System.out.println("- 서킷 트레이닝");
        System.out.println("- 호흡 조절 훈련");
        System.out.println("- 복부 긴장 유지 연습");
        System.out.println("- 복부 자극(타격) 훈련");
        System.out.println();
        System.out.println("주의 사항:");
        System.out.println("- 과도한 피로 누적 주의");
        System.out.println();
        if(ankle.중증==true){
            System.out.println("현재 부상 상태는 중증입니다.");
            System.out.println("모든 훈련을 중단하고 회복에 집중하세요.");
        }
        else if(ankle.주의=true){
            System.out.println("현재 부상 상태는 주의 단계입니다.");
            System.out.println("훈련은 제한적으로만 진행해야 합니다.");
        } else if (ankle.경미) {
            System.out.println("현재 부상 상태는 경미합니다.");
            System.out.println("훈련은 가능하나 강도 조절이 필요합니다.");
        }
    }
}
