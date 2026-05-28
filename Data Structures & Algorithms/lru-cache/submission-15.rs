struct LRUCache {
    map: HashMap<i32, i32>,
    order: VecDeque<i32>,
    capacity: i32
}

impl LRUCache {
    pub fn new(capacity: i32) -> Self {
        Self {
            map: HashMap::with_capacity(capacity as usize),
            order: VecDeque::with_capacity(capacity as usize),
            capacity,
        }
    }

    pub fn get(&mut self, key: i32) -> i32 {
        if let Some(val) = self.map.get(&key).copied() {
            self.order.retain(|&k| k != key);
            self.order.push_back(key);
            return val;
        } else {
            -1
        }
    }

    pub fn put(&mut self, key: i32, value: i32) {
        if self.map.contains_key(&key) {
            self.order.retain(|&k| k != key);
        }
        
        self.order.push_back(key);
        self.map.insert(key, value);

        if self.map.len() > self.capacity as usize {
            if let Some(eldest) = self.order.pop_front() {
                self.map.remove(&eldest);
            }
        }
    }
}
