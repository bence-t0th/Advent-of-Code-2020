//
//  InputManager.swift
//  Day 10
//
//  Created by Bence Tóth on 2020. 12. 10..
//

import Foundation

struct InputManager {
   
    static var example = """
16
10
15
5
1
11
7
19
6
12
4
""".components(separatedBy: "\n").compactMap(Int.init).sorted()
    
    static let input = """
77
10
143
46
79
97
54
116
60
91
80
132
20
154
53
14
103
31
65
110
43
38
47
120
112
87
24
95
33
104
73
22
66
137
21
109
118
63
55
124
146
148
84
86
147
125
23
85
117
71
48
136
151
130
83
56
140
9
49
113
131
133
74
37
127
34
32
106
1
78
11
72
40
96
17
64
92
102
123
126
90
105
57
99
27
70
98
111
30
50
67
2
155
5
119
8
39
""".components(separatedBy: "\n").compactMap(Int.init).sorted()
}
